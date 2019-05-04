package typings
package atJupyterlabRendermimeLib.libMimemodelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/mimemodel", "MimeModel")
@js.native
/**
  * Construct a new mime model.
  */
class MimeModel ()
  extends atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModel {
  def this(options: atJupyterlabRendermimeLib.libMimemodelMod.MimeModelNs.IOptions) = this()
  var _callback: js.Any = js.native
  var _data: js.Any = js.native
  var _metadata: js.Any = js.native
  /**
    * The data associated with the model.
    */
  /* CompleteClass */
  override val data: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  /**
    * The metadata associated with the model.
    */
  /* CompleteClass */
  override val metadata: atPhosphorCoreutilsLib.libJsonMod.ReadonlyJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  /* CompleteClass */
  override val trusted: scala.Boolean = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* CompleteClass */
  override def setData(
    options: atJupyterlabRendermimeDashInterfacesLib.atJupyterlabRendermimeDashInterfacesMod.IRenderMimeNs.IMimeModelNs.ISetDataOptions
  ): scala.Unit = js.native
}

