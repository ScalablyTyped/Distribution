package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a part of a training phrase.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart extends js.Object {
  
  /**
    * Optional. The parameter name for the value extracted from the annotated
    * part of the example. This field is required for annotated parts of the
    * training phrase.
    */
  var alias: js.UndefOr[String] = js.native
  
  /**
    * Optional. The entity type name prefixed with `@`. This field is required
    * for annotated parts of the training phrase.
    */
  var entityType: js.UndefOr[String] = js.native
  
  /**
    * Required. The text for this part.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * Optional. Indicates whether the text was manually annotated. This field
    * is set to true when the Dialogflow Console is used to manually annotate
    * the part. When creating an annotated part with the API, you must set this
    * to true.
    */
  var userDefined: js.UndefOr[Boolean] = js.native
}
object SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePartOps[Self <: SchemaGoogleCloudDialogflowV2IntentTrainingPhrasePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setEntityType(value: String): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setUserDefined(value: Boolean): Self = this.set("userDefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserDefined: Self = this.set("userDefined", js.undefined)
  }
}
