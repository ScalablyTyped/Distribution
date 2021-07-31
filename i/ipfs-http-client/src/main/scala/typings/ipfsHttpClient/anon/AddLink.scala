package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddLink extends StObject {
  
  def addLink(cid: js.Any, dLink: js.Any): js.Promise[^] = js.native
  def addLink(cid: js.Any, dLink: js.Any, options: js.Object): js.Promise[^] = js.native
  
  def appendData(cid: js.Any, data: js.Any): js.Promise[^] = js.native
  def appendData(cid: js.Any, data: js.Any, options: js.Object): js.Promise[^] = js.native
  
  def rmLink(cid: js.Any, dLink: js.Any): js.Promise[^] = js.native
  def rmLink(cid: js.Any, dLink: js.Any, options: js.Object): js.Promise[^] = js.native
  
  def setData(cid: js.Any, data: js.Any): js.Promise[^] = js.native
  def setData(cid: js.Any, data: js.Any, options: js.Object): js.Promise[^] = js.native
}
