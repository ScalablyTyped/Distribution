package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gen extends StObject {
  
  def gen(name: js.Any): js.Promise[js.Any] = js.native
  def gen(name: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def `import`(name: js.Any, pem: js.Any, password: js.Any): js.Promise[js.Any] = js.native
  def `import`(name: js.Any, pem: js.Any, password: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def list(): js.Promise[js.Any] = js.native
  def list(options: js.Object): js.Promise[js.Any] = js.native
  
  def rename(oldName: js.Any, newName: js.Any): js.Promise[js.Any] = js.native
  def rename(oldName: js.Any, newName: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def rm(name: js.Any): js.Promise[js.Any] = js.native
  def rm(name: js.Any, options: js.Object): js.Promise[js.Any] = js.native
}
