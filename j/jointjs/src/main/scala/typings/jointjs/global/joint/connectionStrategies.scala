package typings.jointjs.global.joint

import typings.jointjs.mod.connectionStrategies.ConnectionStrategy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionStrategies {
  
  @JSGlobal("joint.connectionStrategies")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("joint.connectionStrategies.pinAbsolute")
  @js.native
  def pinAbsolute: ConnectionStrategy = js.native
  inline def pinAbsolute_=(x: ConnectionStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pinAbsolute")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectionStrategies.pinRelative")
  @js.native
  def pinRelative: ConnectionStrategy = js.native
  inline def pinRelative_=(x: ConnectionStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pinRelative")(x.asInstanceOf[js.Any])
  
  @JSGlobal("joint.connectionStrategies.useDefaults")
  @js.native
  def useDefaults: ConnectionStrategy = js.native
  inline def useDefaults_=(x: ConnectionStrategy): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useDefaults")(x.asInstanceOf[js.Any])
}
