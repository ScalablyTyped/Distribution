package typings.jest.mod.jest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Context
trait Context extends js.Object {
  var config: ProjectConfig
  var hasteFS: HasteFS
  var moduleMap: ModuleMap
  var resolver: HasteResolver
}

object Context {
  @scala.inline
  def apply(config: ProjectConfig, hasteFS: HasteFS, moduleMap: ModuleMap, resolver: HasteResolver): Context = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hasteFS = hasteFS.asInstanceOf[js.Any], moduleMap = moduleMap.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Context]
  }
}

