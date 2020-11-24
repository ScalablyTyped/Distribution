package typings.jupyterlabRendermime.mimemodelMod

import typings.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime/lib/mimemodel", "MimeModel")
@js.native
/**
  * Construct a new mime model.
  */
class MimeModel_ () extends IMimeModel {
  def this(options: IOptions) = this()
  
  var _callback: js.Any = js.native
  
  var _data: js.Any = js.native
  
  var _metadata: js.Any = js.native
  
  /**
    * The data associated with the model.
    */
  @JSName("data")
  def data_MMimeModel_ : ReadonlyPartialJSONObject = js.native
  
  /**
    * The metadata associated with the model.
    */
  @JSName("metadata")
  def metadata_MMimeModel_ : ReadonlyPartialJSONObject = js.native
}
