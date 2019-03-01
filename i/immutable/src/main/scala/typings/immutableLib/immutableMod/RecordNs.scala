package typings
package immutableLib.immutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("immutable", "Record")
@js.native
object RecordNs extends js.Object {
  @js.native
  trait Factory[TProps /* <: js.Object */]
    extends org.scalablytyped.runtime.Instantiable0[immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps]]
       with org.scalablytyped.runtime.Instantiable1[
          (/* values */ stdLib.Iterable[js.Tuple2[java.lang.String, js.Any]]) | (/* values */ stdLib.Partial[TProps]), 
          immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps]
        ] {
    /**
      * The name provided to `Record(values, name)` can be accessed with
      * `displayName`.
      */
    var displayName: java.lang.String = js.native
    def apply(): immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps] = js.native
    def apply(values: stdLib.Iterable[js.Tuple2[java.lang.String, _]]): immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps] = js.native
    def apply(values: stdLib.Partial[TProps]): immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps] = js.native
  }
  
  def Factory[TProps /* <: js.Object */](): immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps] = js.native
  def Factory[TProps /* <: js.Object */](values: stdLib.Iterable[js.Tuple2[java.lang.String, _]]): immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps] = js.native
  def Factory[TProps /* <: js.Object */](values: stdLib.Partial[TProps]): immutableLib.immutableMod.Record[TProps] with stdLib.Readonly[TProps] = js.native
  def getDescriptiveName(record: immutableLib.immutableMod.Record[_]): java.lang.String = js.native
  def isRecord(maybeRecord: js.Any): /* is immutable.immutable.Record<any> */ scala.Boolean = js.native
}

