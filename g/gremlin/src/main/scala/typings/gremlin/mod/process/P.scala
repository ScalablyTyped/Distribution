package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.P")
@js.native
open class P protected () extends StObject {
  def this(operator: EnumValue, value: Any) = this()
  def this(operator: EnumValue, value: Any, other: Any) = this()
  
  def and(): P = js.native
  def and(arg: Any): P = js.native
  
  def or(): P = js.native
  def or(arg: Any): P = js.native
}
object P {
  
  @JSImport("gremlin", "process.P")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def between(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("between")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def eq_(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("eq")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def gt(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("gt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def gte(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("gte")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def inside(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("inside")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def lt(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("lt")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def lte(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("lte")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def neq(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("neq")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def not(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("not")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def outside(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("outside")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def test(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("test")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def within(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("within")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
  
  /* static member */
  inline def without(args: Any*): P = ^.asInstanceOf[js.Dynamic].applyDynamic("without")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[P]
}
