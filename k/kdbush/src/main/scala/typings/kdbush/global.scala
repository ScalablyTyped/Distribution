package typings.kdbush

import typings.kdbush.mod.Get
import typings.kdbush.mod.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object KDBush {
    
    @JSGlobal("KDBush")
    @js.native
    class ^[T] protected ()
      extends typings.kdbush.mod.^[T] {
      def this(points: Points) = this()
      def this(points: js.Array[T], getX: Get[T], getY: Get[T]) = this()
      def this(points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double) = this()
      def this(
        points: js.Array[T],
        getX: Get[T],
        getY: Get[T],
        nodeSize: Double,
        ArrayType: typings.kdbush.mod.ArrayType
      ) = this()
      def this(
        points: js.Array[T],
        getX: Get[T],
        getY: Get[T],
        nodeSize: Unit,
        ArrayType: typings.kdbush.mod.ArrayType
      ) = this()
    }
  }
}
