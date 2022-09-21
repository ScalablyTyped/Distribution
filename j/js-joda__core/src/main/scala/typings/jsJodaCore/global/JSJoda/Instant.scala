package typings.jsJodaCore.global.JSJoda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("JSJoda.Instant")
@js.native
/* private */ open class Instant ()
  extends typings.jsJodaCore.mod.Instant
/* static members */
object Instant {
  
  @JSGlobal("JSJoda.Instant")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("JSJoda.Instant.EPOCH")
  @js.native
  def EPOCH: typings.jsJodaCore.mod.Instant = js.native
  inline def EPOCH_=(x: typings.jsJodaCore.mod.Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPOCH")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Instant.FROM")
  @js.native
  def FROM: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.Instant] = js.native
  inline def FROM_=(x: typings.jsJodaCore.mod.TemporalQuery[typings.jsJodaCore.mod.Instant]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FROM")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Instant.MAX")
  @js.native
  def MAX: typings.jsJodaCore.mod.Instant = js.native
  inline def MAX_=(x: typings.jsJodaCore.mod.Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Instant.MAX_SECONDS")
  @js.native
  def MAX_SECONDS: typings.jsJodaCore.mod.Instant = js.native
  inline def MAX_SECONDS_=(x: typings.jsJodaCore.mod.Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SECONDS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Instant.MIN")
  @js.native
  def MIN: typings.jsJodaCore.mod.Instant = js.native
  inline def MIN_=(x: typings.jsJodaCore.mod.Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN")(x.asInstanceOf[js.Any])
  
  @JSGlobal("JSJoda.Instant.MIN_SECONDS")
  @js.native
  def MIN_SECONDS: typings.jsJodaCore.mod.Instant = js.native
  inline def MIN_SECONDS_=(x: typings.jsJodaCore.mod.Instant): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_SECONDS")(x.asInstanceOf[js.Any])
  
  inline def from(temporal: typings.jsJodaCore.mod.TemporalAccessor): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(temporal.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Instant]
  
  inline def now(): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.jsJodaCore.mod.Instant]
  inline def now(clock: typings.jsJodaCore.mod.Clock): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(clock.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Instant]
  
  inline def ofEpochMicro(epochMicro: Double): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochMicro")(epochMicro.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Instant]
  
  inline def ofEpochMilli(epochMilli: Double): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochMilli")(epochMilli.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Instant]
  
  inline def ofEpochSecond(epochSecond: Double): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Instant]
  inline def ofEpochSecond(epochSecond: Double, nanoAdjustment: Double): typings.jsJodaCore.mod.Instant = (^.asInstanceOf[js.Dynamic].applyDynamic("ofEpochSecond")(epochSecond.asInstanceOf[js.Any], nanoAdjustment.asInstanceOf[js.Any])).asInstanceOf[typings.jsJodaCore.mod.Instant]
  
  inline def parse(text: String): typings.jsJodaCore.mod.Instant = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[typings.jsJodaCore.mod.Instant]
}
