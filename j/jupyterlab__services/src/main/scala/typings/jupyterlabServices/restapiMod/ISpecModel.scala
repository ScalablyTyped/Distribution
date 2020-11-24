package typings.jupyterlabServices.restapiMod

import org.scalablytyped.runtime.StringDictionary
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpecModel extends PartialJSONObject {
  
  /**
    * A list of command line arguments used to start the kernel.
    */
  val argv: js.Array[String] = js.native
  
  /**
    * The kernel’s name as it should be displayed in the UI.
    */
  val display_name: String = js.native
  
  /**
    * A dictionary of environment variables to set for the kernel.
    */
  val env: js.UndefOr[PartialJSONObject] = js.native
  
  /**
    * The name of the language of the kernel.
    */
  val language: String = js.native
  
  /**
    * A dictionary of additional attributes about this kernel; used by clients to aid in kernel selection.
    */
  val metadata: js.UndefOr[PartialJSONObject] = js.native
  
  /**
    * The name of the kernel spec.
    */
  val name: String = js.native
  
  /**
    * A mapping of resource file name to download path.
    */
  val resources: StringDictionary[String] = js.native
}
object ISpecModel {
  
  @scala.inline
  def apply(
    argv: js.Array[String],
    display_name: String,
    language: String,
    name: String,
    resources: StringDictionary[String]
  ): ISpecModel = {
    val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpecModel]
  }
  
  @scala.inline
  implicit class ISpecModelOps[Self <: ISpecModel] (val x: Self) extends AnyVal {
    
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
    def setArgvVarargs(value: String*): Self = this.set("argv", js.Array(value :_*))
    
    @scala.inline
    def setArgv(value: js.Array[String]): Self = this.set("argv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResources(value: StringDictionary[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnv(value: PartialJSONObject): Self = this.set("env", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnv: Self = this.set("env", js.undefined)
    
    @scala.inline
    def setMetadata(value: PartialJSONObject): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
