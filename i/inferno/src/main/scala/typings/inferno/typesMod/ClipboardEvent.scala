package typings.inferno.typesMod

import typings.std.DataTransfer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.std.Event because Already inherited
- typings.std.ClipboardEvent because var conflicts: cancelBubble, currentTarget, returnValue. Inlined clipboardData */ @js.native
trait ClipboardEvent[T]
  extends StObject
     with SemiSyntheticEvent[T] {
  
  /* standard dom */
  val clipboardData: DataTransfer | Null = js.native
}
