package typings.jupyterlabServices.contentsMod.Contents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A contents model.
  */
@js.native
trait IModel extends js.Object {
  
  /**
    * The chunk of the file upload.
    */
  val chunk: js.UndefOr[Double] = js.native
  
  /**
    * The optional file content.
    */
  val content: js.Any = js.native
  
  /**
    * File creation timestamp.
    */
  val created: String = js.native
  
  /**
    * The format of the file `content`.
    *
    * #### Notes
    * Only relevant for type: 'file'
    */
  val format: FileFormat = js.native
  
  /**
    * Last modified timestamp.
    */
  val last_modified: String = js.native
  
  /**
    * Specify the mime-type of file contents.
    *
    * #### Notes
    * Only non-`null` when `content` is present and `type` is `"file"`.
    */
  val mimetype: String = js.native
  
  /**
    * Name of the contents file.
    *
    * #### Notes
    *  Equivalent to the last part of the `path` field.
    */
  val name: String = js.native
  
  /**
    * The full file path.
    *
    * #### Notes
    * It will *not* start with `/`, and it will be `/`-delimited.
    */
  val path: String = js.native
  
  /**
    * The size of then file in bytes.
    */
  val size: js.UndefOr[Double] = js.native
  
  /**
    * The type of file.
    */
  val `type`: ContentType = js.native
  
  /**
    * Whether the requester has permission to edit the file.
    */
  val writable: Boolean = js.native
}
object IModel {
  
  @scala.inline
  def apply(
    content: js.Any,
    created: String,
    format: FileFormat,
    last_modified: String,
    mimetype: String,
    name: String,
    path: String,
    `type`: ContentType,
    writable: Boolean
  ): IModel = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], last_modified = last_modified.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IModel]
  }
  
  @scala.inline
  implicit class IModelOps[Self <: IModel] (val x: Self) extends AnyVal {
    
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
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: FileFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_modified(value: String): Self = this.set("last_modified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimetype(value: String): Self = this.set("mimetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ContentType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritable(value: Boolean): Self = this.set("writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChunk(value: Double): Self = this.set("chunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChunk: Self = this.set("chunk", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
