package typings.gulpCond

import org.scalablytyped.runtime.Shortcut
import typings.gulpCond.mod.GulpCond.Condition
import typings.gulpCond.mod.GulpCond.Expresion
import typings.node.NodeJS.ReadWriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("gulp-cond", JSImport.Namespace)
  @js.native
  val ^ : GulpCond = js.native
  
  object GulpCond {
    
    type Condition = Boolean | js.Function0[Boolean]
    
    type Expresion = ReadWriteStream | js.Function0[ReadWriteStream]
  }
  type GulpCond = js.Function3[
    /* condition */ Condition, 
    /* expr1 */ Expresion, 
    /* expr2 */ js.UndefOr[Expresion], 
    ReadWriteStream
  ]
  
  type _To = GulpCond
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: GulpCond = ^
}
