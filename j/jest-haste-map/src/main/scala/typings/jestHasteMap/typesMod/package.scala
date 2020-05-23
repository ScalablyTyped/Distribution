package typings.jestHasteMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DuplicatesIndex = typings.std.Map[
    java.lang.String, 
    typings.std.Map[java.lang.String, typings.jestHasteMap.typesMod.DuplicatesSet]
  ]
  type DuplicatesSet = typings.std.Map[java.lang.String, /* type */ scala.Double]
  type EventsQueue = js.Array[typings.jestHasteMap.anon.FilePath]
  type FileData = typings.std.Map[typings.jestTypes.configMod.Path, typings.jestHasteMap.typesMod.FileMetaData]
  type FileMetaData = js.Tuple6[
    java.lang.String, 
    scala.Double, 
    scala.Double, 
    typings.jestHasteMap.jestHasteMapNumbers.`0` | typings.jestHasteMap.jestHasteMapNumbers.`1`, 
    java.lang.String, 
    js.UndefOr[java.lang.String | scala.Null]
  ]
  type HasteRegExp = typings.std.RegExp | (js.Function1[/* str */ java.lang.String, scala.Boolean])
  type IgnoreMatcher = js.Function1[/* item */ java.lang.String, scala.Boolean]
  type Mapper = js.Function1[/* item */ java.lang.String, js.Array[java.lang.String] | scala.Null]
  type MockData = typings.std.Map[java.lang.String, typings.jestTypes.configMod.Path]
  type ModuleMapData = typings.std.Map[java.lang.String, typings.jestHasteMap.typesMod.ModuleMapItem]
  type ModuleMapItem = org.scalablytyped.runtime.StringDictionary[typings.jestHasteMap.typesMod.ModuleMetaData]
  type ModuleMetaData = js.Tuple2[typings.jestTypes.configMod.Path, /* type */ scala.Double]
  type WatchmanClocks = typings.std.Map[typings.jestTypes.configMod.Path, java.lang.String]
}
