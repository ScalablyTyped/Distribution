package typings.ioredis.mod

import typings.ioredis.anon.TypeofCommand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped new (name : string, args : std.Array<ioredis.ioredis.ValueType>, opts : ioredis.ioredis.CommandOptions | undefined, callback : (err : null, result : any): void | undefined): ioredis.ioredis.Command */ @JSImport("ioredis", "Command")
@js.native
class CommandCls protected ()
  extends StObject
     with TypeofCommand {
  def this(name: String, args: js.Array[ValueType]) = this()
  def this(name: String, args: js.Array[ValueType], opts: CommandOptions) = this()
  def this(
    name: String,
    args: js.Array[ValueType],
    opts: Unit,
    callback: js.Function2[/* err */ Null, /* result */ js.Any, Unit]
  ) = this()
  def this(
    name: String,
    args: js.Array[ValueType],
    opts: CommandOptions,
    callback: js.Function2[/* err */ Null, /* result */ js.Any, Unit]
  ) = this()
  
  /* static member */
  /* CompleteClass */
  override def setArgumentTransformer(name: String, fn: js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]): Unit = js.native
  
  /* static member */
  /* CompleteClass */
  override def setReplyTransformer(name: String, fn: js.Function1[/* result */ js.Any, js.Any]): Unit = js.native
}
