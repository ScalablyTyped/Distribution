package typings.jupyterlabDocregistry.defaultMod

import typings.jupyterlabServices.contentsMod.Contents.ContentType
import typings.jupyterlabServices.contentsMod.Contents.FileFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/docregistry/lib/default", "Base64ModelFactory")
@js.native
class Base64ModelFactory () extends TextModelFactory {
  /**
    * The type of the file.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("contentType")
  def contentType_MBase64ModelFactory(): ContentType = js.native
  /**
    * The format of the file.
    *
    * This is a read-only property.
    */
  @JSName("fileFormat")
  def fileFormat_MBase64ModelFactory(): FileFormat = js.native
  /**
    * The name of the model type.
    *
    * #### Notes
    * This is a read-only property.
    */
  @JSName("name")
  def name_MBase64ModelFactory(): String = js.native
}

