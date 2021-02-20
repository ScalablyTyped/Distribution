package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgValidatorMethods extends StObject {
  
  /**
    * Adds an new input to the fields collection and initializes it with the validator. Note: Additional fields are only accepted if the validator has been created with the collection.
    *
    * @param field An object with the field selector and options.
    */
  def addField(field: js.Object): Unit = js.native
  
  /**
    * Changes the widget language to global language. Global language is the value in $.ig.util.language
    */
  def changeGlobalLanguage(): Unit = js.native
  
  /**
    * Changes the widget regional settins to global regional settings. Global regional settings are container in $.ig.util.regional
    */
  def changeGlobalRegional(): Unit = js.native
  
  /**
    * Changes the all locales contained into a specified container to the language specified in [options.language](ui.igwidget#options:language)
    * Note that this method is for rare scenarios, use [language](ui.igwidget#options:language) or [locale](ui.igwidget#options:locale) option setter
    *
    * @param $container Optional parameter - if not set it would use the element of the widget as $container
    */
  def changeLocale($container: js.Object): Unit = js.native
  
  /**
    * Destroys the validator widget.
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets all current error messages for invalid field(s). Note that this method does not validate and states and messages are only updated on validation, so
    * this can be used on formValidated event or after validate/isValid method calls.
    *
    * @param field Optional field object, selector or zero-based index for a single field to get error message for.
    */
  def getErrorMessages(): js.Array[_] = js.native
  def getErrorMessages(field: js.Object): js.Array[_] = js.native
  
  /**
    * Hide any possible message(s) (either messageTarget or igNotifier).
    * Note: When the validator has a fields collection, not passing a field will hide messages on all fields.
    *
    * @param field Optional field object, its selector or zero-based index to hide message for.
    */
  def hide(): Unit = js.native
  def hide(field: js.Object): Unit = js.native
  
  /**
    * Check for currently displayed message(s). Takes an optional field.
    * Note: When the validator has a fields collection, not passing a field will return a cumulative true even if just one field has a visible message.
    *
    * @param field Optional field object, selector or zero-based index for a single field to get error message for.
    */
  def isMessageDisplayed(): Boolean = js.native
  def isMessageDisplayed(field: js.Object): Boolean = js.native
  
  /**
    * Trigger validation but do not display error messages.
    *
    * @param field Optional field object, its selector or zero-based index to check. Only has effect with fields collection and skips other fields.
    */
  def isValid(): Boolean = js.native
  def isValid(field: js.Object): Boolean = js.native
  
  /**
    * Gets the notifier for the igValidator or for a single filed.
    *
    * @param field Optional field object, its selector or zero-based index to get notifier for.
    */
  def notifier(): js.Object = js.native
  def notifier(field: js.Object): js.Object = js.native
  
  /**
    * Removes an input from the fields collection.
    *
    * @param field The field object to remove, its zero-based index or selector.
    */
  def removeField(field: js.Object): Unit = js.native
  
  /**
    * Updates a field in the validator collection. Used to reinitialize field in case a control has been created after the validator or to pass in new options.
    *
    * @param field The field object to update, its zero-based index or selector.
    * @param fieldOptions New options to apply to the field.
    */
  def updateField(field: js.Object): Unit = js.native
  def updateField(field: js.Object, fieldOptions: js.Object): Unit = js.native
  
  /**
    * Trigger validation and show errors for invalid fields.
    *
    * @param field Optional field object, its selector or zero-based index to check. Only has effect with fields collection and skips other fields.
    */
  def validate(): Boolean = js.native
  def validate(field: js.Object): Boolean = js.native
}
