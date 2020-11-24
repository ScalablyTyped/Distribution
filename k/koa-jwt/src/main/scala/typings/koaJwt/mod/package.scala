package typings.koaJwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type SecretLoader = js.Function2[
    /* header */ js.Any, 
    /* payload */ js.Any, 
    js.Promise[
      java.lang.String | (js.Array[typings.node.Buffer | java.lang.String]) | typings.node.Buffer
    ]
  ]
}
