package typings.jsData.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-data", "Container")
@js.native
class Container () extends Component {
  def this(opts: js.Any) = this()
  
  var _adapters: js.Object = js.native
  
  var _mappers: js.Object = js.native
  
  def as(name: String): js.Any = js.native
  
  def createRecord(name: String): Record = js.native
  def createRecord(name: String, props: js.UndefOr[scala.Nothing], opts: js.Any): Record = js.native
  def createRecord(name: String, props: js.Any): Record = js.native
  def createRecord(name: String, props: js.Any, opts: js.Any): Record = js.native
  
  def defineMapper(name: String): Mapper = js.native
  def defineMapper(name: String, opts: js.Any): Mapper = js.native
  
  def defineResource(name: String): Mapper = js.native
  def defineResource(name: String, opts: js.Any): Mapper = js.native
  
  def getAdapter(name: js.Any): js.Any = js.native
  
  def getAdapterName(): String = js.native
  def getAdapterName(opts: js.Any): String = js.native
  
  def getAdapters(): js.Any = js.native
  
  def getMapper(name: String): Mapper = js.native
  
  def getMapperByName(name: String): Mapper = js.native
  
  var mapperClass: Instantiable1[/* opts */ js.UndefOr[js.Any], Mapper] = js.native
  
  var mapperDefaults: js.Any = js.native
  
  def registerAdapter(name: String, adapter: js.Any): Unit = js.native
  def registerAdapter(name: String, adapter: js.Any, opts: js.Any): Unit = js.native
}
