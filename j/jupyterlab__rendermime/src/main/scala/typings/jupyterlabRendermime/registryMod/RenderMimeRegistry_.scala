package typings.jupyterlabRendermime.registryMod

import typings.jupyterlabRendermime.registryMod.RenderMimeRegistry.IOptions
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime/lib/registry", "RenderMimeRegistry")
@js.native
/**
  * Construct a new rendermime.
  *
  * @param options - The options for initializing the instance.
  */
class RenderMimeRegistry_ () extends IRenderMimeRegistry {
  def this(options: IOptions) = this()
  
  var _factories: js.Any = js.native
  
  var _id: js.Any = js.native
  
  var _ranks: js.Any = js.native
  
  var _types: js.Any = js.native
  
  /**
    * The ordered list of mimeTypes.
    */
  @JSName("mimeTypes")
  def mimeTypes_MRenderMimeRegistry_ : js.Array[String] = js.native
}
