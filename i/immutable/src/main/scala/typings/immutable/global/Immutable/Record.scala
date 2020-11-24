package typings.immutable.global.Immutable

import typings.immutable.Immutable.Record.Factory
import typings.std.Iterable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Immutable.Record")
@js.native
object Record extends js.Object {
  
  def apply[TProps](defaultValues: TProps): Factory[TProps] = js.native
  def apply[TProps](defaultValues: TProps, name: String): Factory[TProps] = js.native
  
  def getDescriptiveName(record: typings.immutable.Immutable.Record[_]): String = js.native
  
  def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  
  @js.native
  object Factory extends js.Object {
    
    def apply[TProps /* <: js.Object */](): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Partial[TProps]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
  }
}
