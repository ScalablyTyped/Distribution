package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Export extends StObject {
  
  def `export`(): js.Any = js.native
  def `export`(name: js.Any): js.Any = js.native
  def `export`(name: js.Any, password: js.Any): js.Any = js.native
  def `export`(name: js.Any, password: js.Any, options: js.Any): js.Any = js.native
  def `export`(name: js.Any, password: Unit, options: js.Any): js.Any = js.native
  def `export`(name: Unit, password: js.Any): js.Any = js.native
  def `export`(name: Unit, password: js.Any, options: js.Any): js.Any = js.native
  def `export`(name: Unit, password: Unit, options: js.Any): js.Any = js.native
  
  def gen(): js.Any = js.native
  def gen(name: js.Any): js.Any = js.native
  def gen(name: js.Any, options: js.Any): js.Any = js.native
  def gen(name: Unit, options: js.Any): js.Any = js.native
  
  def `import`(): js.Any = js.native
  def `import`(name: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: js.Any, password: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: js.Any, password: js.Any, options: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: js.Any, password: Unit, options: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: Unit, password: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: Unit, password: js.Any, options: js.Any): js.Any = js.native
  def `import`(name: js.Any, pem: Unit, password: Unit, options: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: js.Any, password: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: js.Any, password: js.Any, options: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: js.Any, password: Unit, options: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: Unit, password: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: Unit, password: js.Any, options: js.Any): js.Any = js.native
  def `import`(name: Unit, pem: Unit, password: Unit, options: js.Any): js.Any = js.native
  
  def info(): js.Any = js.native
  def info(name: js.Any): js.Any = js.native
  def info(name: js.Any, options: js.Any): js.Any = js.native
  def info(name: Unit, options: js.Any): js.Any = js.native
  
  def list(): js.Any = js.native
  def list(options: js.Any): js.Any = js.native
  
  def rename(): js.Promise[Now] = js.native
  def rename(oldName: js.Any): js.Promise[Now] = js.native
  def rename(oldName: js.Any, newName: js.Any): js.Promise[Now] = js.native
  def rename(oldName: js.Any, newName: js.Any, options: js.Any): js.Promise[Now] = js.native
  def rename(oldName: js.Any, newName: Unit, options: js.Any): js.Promise[Now] = js.native
  def rename(oldName: Unit, newName: js.Any): js.Promise[Now] = js.native
  def rename(oldName: Unit, newName: js.Any, options: js.Any): js.Promise[Now] = js.native
  def rename(oldName: Unit, newName: Unit, options: js.Any): js.Promise[Now] = js.native
  
  def rm(): js.Any = js.native
  def rm(name: js.Any): js.Any = js.native
  def rm(name: js.Any, options: js.Any): js.Any = js.native
  def rm(name: Unit, options: js.Any): js.Any = js.native
}
