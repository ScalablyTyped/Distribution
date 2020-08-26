package typings.jestHasteMap.moduleMapMod

import typings.jestHasteMap.typesMod.MockData
import typings.jestHasteMap.typesMod.ModuleMapData
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializableModuleMap extends js.Object {
  var duplicates: js.Array[
    js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
  ] = js.native
  var map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]] = js.native
  var mocks: js.Array[js.Tuple2[String, ValueType[MockData]]] = js.native
  var rootDir: Path = js.native
}

object SerializableModuleMap {
  @scala.inline
  def apply(
    duplicates: js.Array[
      js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
    ],
    map: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]],
    mocks: js.Array[js.Tuple2[String, ValueType[MockData]]],
    rootDir: Path
  ): SerializableModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializableModuleMap]
  }
  @scala.inline
  implicit class SerializableModuleMapOps[Self <: SerializableModuleMap] (val x: Self) extends AnyVal {
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
    def setDuplicatesVarargs(value: (js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]])*): Self = this.set("duplicates", js.Array(value :_*))
    @scala.inline
    def setDuplicates(
      value: js.Array[
          js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, js.Tuple2[String, Double]]]]
        ]
    ): Self = this.set("duplicates", value.asInstanceOf[js.Any])
    @scala.inline
    def setMapVarargs(value: (js.Tuple2[String, ValueType[ModuleMapData]])*): Self = this.set("map", js.Array(value :_*))
    @scala.inline
    def setMap(value: js.Array[js.Tuple2[String, ValueType[ModuleMapData]]]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setMocksVarargs(value: (js.Tuple2[String, ValueType[MockData]])*): Self = this.set("mocks", js.Array(value :_*))
    @scala.inline
    def setMocks(value: js.Array[js.Tuple2[String, ValueType[MockData]]]): Self = this.set("mocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootDir(value: Path): Self = this.set("rootDir", value.asInstanceOf[js.Any])
  }
  
}

