package typings.imageminPngquant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Plugin = js.Function1[
    /* input */ typings.node.Buffer | typings.node.NodeJS.ReadableStream, 
    js.Promise[typings.node.Buffer]
  ]
}
