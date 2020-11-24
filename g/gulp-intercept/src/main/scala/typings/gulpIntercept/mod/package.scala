package typings.gulpIntercept

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Intercept = js.Function1[
    /* interceptFunction */ typings.gulpIntercept.mod.InterceptFunction, 
    typings.node.NodeJS.ReadWriteStream
  ]
  
  type InterceptFunction = js.Function1[/* file */ typings.vinyl.mod.File, typings.vinyl.mod.File]
}
