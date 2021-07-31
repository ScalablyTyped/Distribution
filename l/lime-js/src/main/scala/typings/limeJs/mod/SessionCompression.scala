package typings.limeJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lime-js", "SessionCompression")
@js.native
class SessionCompression () extends StObject
object SessionCompression {
  
  @JSImport("lime-js", "SessionCompression")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("lime-js", "SessionCompression.gzip")
  @js.native
  def gzip: String = js.native
  @scala.inline
  def gzip_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gzip")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("lime-js", "SessionCompression.none")
  @js.native
  def none: String = js.native
  @scala.inline
  def none_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("none")(x.asInstanceOf[js.Any])
}
