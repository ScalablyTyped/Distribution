package typings.gremlin.mod.process

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gremlin", "process.TextP")
@js.native
open class TextP protected () extends StObject {
  def this(operator: EnumValue, value: String) = this()
  def this(operator: EnumValue, value: String, other: Any) = this()
  
  def and(): P = js.native
  def and(arg: Any): P = js.native
  
  def or(): P = js.native
  def or(arg: Any): P = js.native
}
object TextP {
  
  @JSImport("gremlin", "process.TextP")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def containing(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("containing")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def endingWith(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("endingWith")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def notContaining(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("notContaining")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def notEndingWith(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("notEndingWith")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def notRegex(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("notRegex")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def notStartingWith(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("notStartingWith")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def regex(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("regex")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
  
  /* static member */
  inline def startingWith(args: Any*): TextP = ^.asInstanceOf[js.Dynamic].applyDynamic("startingWith")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TextP]
}
