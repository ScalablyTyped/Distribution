package typings.jupyterlabServices.restapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpecModels extends PartialJSONObject {
  
  /**
    * The name of the default kernel spec.
    */
  var default: String = js.native
  
  /**
    * A mapping of kernel spec name to spec.
    */
  val kernelspecs: StringDictionary[js.UndefOr[ISpecModel]] = js.native
}
object ISpecModels {
  
  @scala.inline
  def apply(default: String, kernelspecs: StringDictionary[js.UndefOr[ISpecModel]]): ISpecModels = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpecModels]
  }
  
  @scala.inline
  implicit class ISpecModelsOps[Self <: ISpecModels] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKernelspecs(value: StringDictionary[js.UndefOr[ISpecModel]]): Self = this.set("kernelspecs", value.asInstanceOf[js.Any])
  }
}
