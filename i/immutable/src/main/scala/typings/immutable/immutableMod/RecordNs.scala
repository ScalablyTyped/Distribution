package typings.immutable.immutableMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Iterable
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Record")
@js.native
object RecordNs extends js.Object {
  @js.native
  trait Factory[TProps /* <: js.Object */]
    extends Instantiable0[Record[TProps] with TProps]
       with Instantiable1[
          (/* values */ Iterable[js.Tuple2[String, js.Any]]) | (/* values */ Partial[TProps]), 
          Record[TProps] with TProps
        ] {
    /**
      * The name provided to `Record(values, name)` can be accessed with
      * `displayName`.
      */
    var displayName: String = js.native
    def apply(): Record[TProps] with TProps = js.native
    def apply(values: Iterable[js.Tuple2[String, _]]): Record[TProps] with TProps = js.native
    def apply(values: Partial[TProps]): Record[TProps] with TProps = js.native
  }
  
  def Factory[TProps /* <: js.Object */](): Record[TProps] with TProps = js.native
  def Factory[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): Record[TProps] with TProps = js.native
  def Factory[TProps /* <: js.Object */](values: Partial[TProps]): Record[TProps] with TProps = js.native
  def getDescriptiveName(record: Record[_]): String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ Boolean = js.native
}

