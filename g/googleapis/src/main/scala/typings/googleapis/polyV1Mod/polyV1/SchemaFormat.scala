package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The same asset can be represented in different formats, for example, a
  * [WaveFront .obj](//en.wikipedia.org/wiki/Wavefront_.obj_file) file with its
  * corresponding .mtl file or a [Khronos glTF](//www.khronos.org/gltf) file
  * with its corresponding .glb binary data. A format refers to a specific
  * representation of an asset and contains all information needed to retrieve
  * and describe this representation.
  */
@js.native
trait SchemaFormat extends js.Object {
  
  /**
    * Complexity stats about this representation of the asset.
    */
  var formatComplexity: js.UndefOr[SchemaFormatComplexity] = js.native
  
  /**
    * A short string that identifies the format type of this representation.
    * Possible values are: `FBX`, `GLTF`, `GLTF2`, `OBJ`, and `TILT`.
    */
  var formatType: js.UndefOr[String] = js.native
  
  /**
    * A list of dependencies of the root element. May include, but is not
    * limited to, materials, textures, and shader programs.
    */
  var resources: js.UndefOr[js.Array[SchemaFile]] = js.native
  
  /**
    * The root of the file hierarchy. This will always be populated. For some
    * format_types - such as `TILT`, which are self-contained - this is all of
    * the data.  Other types - such as `OBJ` - often reference other data
    * elements. These are contained in the resources field.
    */
  var root: js.UndefOr[SchemaFile] = js.native
}
object SchemaFormat {
  
  @scala.inline
  def apply(): SchemaFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormat]
  }
  
  @scala.inline
  implicit class SchemaFormatOps[Self <: SchemaFormat] (val x: Self) extends AnyVal {
    
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
    def setFormatComplexity(value: SchemaFormatComplexity): Self = this.set("formatComplexity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatComplexity: Self = this.set("formatComplexity", js.undefined)
    
    @scala.inline
    def setFormatType(value: String): Self = this.set("formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatType: Self = this.set("formatType", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: SchemaFile*): Self = this.set("resources", js.Array(value :_*))
    
    @scala.inline
    def setResources(value: js.Array[SchemaFile]): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setRoot(value: SchemaFile): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
  }
}
