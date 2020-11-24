package typings.konva

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object nodeMod {
  
  type Filter = js.ThisFunction1[
    /* this */ typings.konva.nodeMod.Node[typings.konva.nodeMod.NodeConfig], 
    /* imageData */ typings.std.ImageData, 
    scala.Unit
  ]
  
  type KonvaEventListener[This, EventType] = js.ThisFunction1[
    /* this */ This, 
    /* ev */ typings.konva.nodeMod.KonvaEventObject[EventType], 
    scala.Unit
  ]
}
