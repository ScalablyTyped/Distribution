package typings
package jsDashDataLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data", "Container")
@js.native
class Container () extends Component {
  def this(opts: js.Any) = this()
  var _adapters: js.Object = js.native
  var _mappers: js.Object = js.native
  var mapperClass: org.scalablytyped.runtime.Instantiable1[/* opts */ js.UndefOr[/* opts */ js.Any], Mapper] = js.native
  var mapperDefaults: js.Any = js.native
  def as(name: java.lang.String): js.Any = js.native
  def createRecord(name: java.lang.String): Record = js.native
  def createRecord(name: java.lang.String, props: js.Any): Record = js.native
  def createRecord(name: java.lang.String, props: js.Any, opts: js.Any): Record = js.native
  def defineMapper(name: java.lang.String): Mapper = js.native
  def defineMapper(name: java.lang.String, opts: js.Any): Mapper = js.native
  def defineResource(name: java.lang.String): Mapper = js.native
  def defineResource(name: java.lang.String, opts: js.Any): Mapper = js.native
  def getAdapter(name: js.Any): js.Any = js.native
  def getAdapterName(): java.lang.String = js.native
  def getAdapterName(opts: js.Any): java.lang.String = js.native
  def getAdapters(): js.Any = js.native
  def getMapper(name: java.lang.String): Mapper = js.native
  def getMapperByName(name: java.lang.String): Mapper = js.native
  def registerAdapter(name: java.lang.String, adapter: js.Any): scala.Unit = js.native
  def registerAdapter(name: java.lang.String, adapter: js.Any, opts: js.Any): scala.Unit = js.native
}

