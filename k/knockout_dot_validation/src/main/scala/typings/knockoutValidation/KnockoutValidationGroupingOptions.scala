package typings.knockoutValidation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutValidationGroupingOptions extends StObject {
  
  /**
    * indicates whether to walk the ViewModel (or object)
    * recursively, or only walk first-level properties.
    */
  var deep: js.UndefOr[Boolean] = js.native
  
  /**
    * indicates whether changes to observableArrays inside
    * the model should cause the validator to re-run
    */
  var live: js.UndefOr[Boolean] = js.native
  
  /**
    * indicates whether the returned errors object
    * is a ko.computed or a simple function
    */
  var observable: js.UndefOr[Boolean] = js.native
}
object KnockoutValidationGroupingOptions {
  
  @scala.inline
  def apply(): KnockoutValidationGroupingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutValidationGroupingOptions]
  }
  
  @scala.inline
  implicit class KnockoutValidationGroupingOptionsMutableBuilder[Self <: KnockoutValidationGroupingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeep(value: Boolean): Self = StObject.set(x, "deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepUndefined: Self = StObject.set(x, "deep", js.undefined)
    
    @scala.inline
    def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
    
    @scala.inline
    def setObservable(value: Boolean): Self = StObject.set(x, "observable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObservableUndefined: Self = StObject.set(x, "observable", js.undefined)
  }
}
