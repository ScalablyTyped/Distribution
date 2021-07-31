package typings.jestUtil

import typings.node.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preRunMessageMod {
  
  @JSImport("jest-util/build/preRunMessage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def print(stream: WritableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("print")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def remove(stream: WritableStream): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
