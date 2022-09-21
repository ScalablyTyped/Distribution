package typings.matrixJsSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-js-sdk", "Relations")
@js.native
open class Relations protected () extends EventEmitter {
  def this(relationType: String, eventType: String) = this()
  def this(relationType: String, eventType: String, room: Room) = this()
  
  def addEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
  
  def getAnnotationsBySender(): (StringDictionary[Set[MatrixEvent[EventContentTypeMessage, EventType]]]) | Null = js.native
  
  def getLastReplacement(): (MatrixEvent[EventContentTypeMessage, EventType]) | Null = js.native
  
  def getRelations(): js.Array[MatrixEvent[EventContentTypeMessage, EventType]] = js.native
  
  def getSortedAnnotationsByKey(): (StringDictionary[Set[MatrixEvent[EventContentTypeMessage, EventType]]]) | Null = js.native
  
  def setTargetEvent(event: MatrixEvent[EventContentTypeMessage, EventType]): Unit = js.native
}
