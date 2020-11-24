package typings.jestConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object utilsMod {
  
  type JSONString = java.lang.String with js.Object
  
  type OrArray[T] = T | js.Array[T]
  
  type ReplaceRootDirConfigObj = typings.std.Record[java.lang.String, typings.jestTypes.configMod.Path]
  
  type ReplaceRootDirConfigValues = typings.jestConfig.utilsMod.OrArray[
    typings.jestTypes.configMod.Path | typings.std.RegExp | typings.jestConfig.utilsMod.ReplaceRootDirConfigObj
  ]
}
