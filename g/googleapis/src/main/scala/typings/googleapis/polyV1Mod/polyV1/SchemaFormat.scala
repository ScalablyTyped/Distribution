package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    formatComplexity: SchemaFormatComplexity = null,
    formatType: String = null,
    resources: js.Array[SchemaFile] = null,
    root: SchemaFile = null
  ): SchemaFormat = {
    val __obj = js.Dynamic.literal()
    if (formatComplexity != null) __obj.updateDynamic("formatComplexity")(formatComplexity.asInstanceOf[js.Any])
    if (formatType != null) __obj.updateDynamic("formatType")(formatType.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormat]
  }
}

