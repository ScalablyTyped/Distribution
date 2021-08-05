package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The same asset can be represented in different formats, for example, a
  * [WaveFront .obj](//en.wikipedia.org/wiki/Wavefront_.obj_file) file with its
  * corresponding .mtl file or a [Khronos glTF](//www.khronos.org/gltf) file
  * with its corresponding .glb binary data. A format refers to a specific
  * representation of an asset and contains all information needed to retrieve
  * and describe this representation.
  */
trait SchemaFormat extends StObject {
  
  /**
    * Complexity stats about this representation of the asset.
    */
  var formatComplexity: js.UndefOr[SchemaFormatComplexity] = js.undefined
  
  /**
    * A short string that identifies the format type of this representation.
    * Possible values are: `FBX`, `GLTF`, `GLTF2`, `OBJ`, and `TILT`.
    */
  var formatType: js.UndefOr[String] = js.undefined
  
  /**
    * A list of dependencies of the root element. May include, but is not
    * limited to, materials, textures, and shader programs.
    */
  var resources: js.UndefOr[js.Array[SchemaFile]] = js.undefined
  
  /**
    * The root of the file hierarchy. This will always be populated. For some
    * format_types - such as `TILT`, which are self-contained - this is all of
    * the data.  Other types - such as `OBJ` - often reference other data
    * elements. These are contained in the resources field.
    */
  var root: js.UndefOr[SchemaFile] = js.undefined
}
object SchemaFormat {
  
  inline def apply(): SchemaFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormat]
  }
  
  extension [Self <: SchemaFormat](x: Self) {
    
    inline def setFormatComplexity(value: SchemaFormatComplexity): Self = StObject.set(x, "formatComplexity", value.asInstanceOf[js.Any])
    
    inline def setFormatComplexityUndefined: Self = StObject.set(x, "formatComplexity", js.undefined)
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setResources(value: js.Array[SchemaFile]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaFile*): Self = StObject.set(x, "resources", js.Array(value :_*))
    
    inline def setRoot(value: SchemaFile): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
