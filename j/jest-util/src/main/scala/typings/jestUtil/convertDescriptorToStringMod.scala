package typings.jestUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertDescriptorToStringMod {
  
  @JSImport("jest-util/build/convertDescriptorToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(descriptor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(descriptor.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def default(descriptor: js.Function): js.Function | String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.Function | String]
  @scala.inline
  def default(descriptor: Double): Double | String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(descriptor.asInstanceOf[js.Any]).asInstanceOf[Double | String]
  @scala.inline
  def default(descriptor: Unit): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(descriptor.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
