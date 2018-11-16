package typings
package atIonicCliDashFrameworkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/cli-framework/lib/config", "BaseConfig")
@js.native
abstract class BaseConfig[T /* <: js.Object */] protected () extends js.Object {
  def this(p: java.lang.String) = this()
  def this(p: java.lang.String, hasPathPrefix: BaseConfigOptions) = this()
  var c: T = js.native
  val file: js.Any = js.native
  val p: java.lang.String = js.native
  val pathPrefix: js.Array[java.lang.String] = js.native
  def get[P /* <: java.lang.String */](property: P): /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(P))) */js.Any = js.native
  def get[P /* <: java.lang.String */](
    property: P,
    defaultValue: stdLib.NonNullable[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(P))) */js.Any
    ]
  ): stdLib.NonNullable[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(P))) */js.Any
  ] = js.native
  def provideDefaults(c: stdLib.Partial[stdLib.Readonly[T]]): T = js.native
  def set[P /* <: java.lang.String */](
    property: P,
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(P))) */js.Any
  ): scala.Unit = js.native
  def unset[P /* <: java.lang.String */](property: P): scala.Unit = js.native
}

