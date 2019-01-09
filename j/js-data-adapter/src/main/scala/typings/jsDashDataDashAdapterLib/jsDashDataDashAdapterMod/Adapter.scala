package typings
package jsDashDataDashAdapterLib.jsDashDataDashAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js-data-adapter", "Adapter")
@js.native
class Adapter () extends js.Object {
  def this(opts: IAdapterOpts) = this()
  var debug: scala.Boolean = js.native
  var raw: scala.Boolean = js.native
  def afterCount(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict, response: IDict): js.Any = js.native
  def afterCount(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict, response: Response): js.Any = js.native
  def afterCreate(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict, response: IDict): js.Any = js.native
  def afterCreate(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict, response: Response): js.Any = js.native
  def afterCreateMany(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    props: js.Array[IDict],
    opts: IDict,
    response: js.Array[IDict]
  ): js.Any = js.native
  def afterCreateMany(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    props: js.Array[IDict],
    opts: IDict,
    response: Response
  ): js.Any = js.native
  def afterDestroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict, response: Response): js.Any = js.native
  def afterDestroy(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    id: java.lang.String,
    opts: IDict,
    response: scala.Unit
  ): js.Any = js.native
  def afterDestroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict, response: Response): js.Any = js.native
  def afterDestroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict, response: scala.Unit): js.Any = js.native
  def afterDestroyAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict, response: Response): js.Any = js.native
  def afterDestroyAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict, response: scala.Unit): js.Any = js.native
  def afterFind(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict, response: IDict): js.Any = js.native
  def afterFind(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict, response: Response): js.Any = js.native
  def afterFind(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict, response: IDict): js.Any = js.native
  def afterFind(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict, response: Response): js.Any = js.native
  def afterFindAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict, response: js.Array[IDict]): js.Any = js.native
  def afterFindAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict, response: Response): js.Any = js.native
  def afterSum(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    field: java.lang.String,
    query: IDict,
    opts: IDict,
    response: Response
  ): js.Any = js.native
  def afterSum(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    field: java.lang.String,
    query: IDict,
    opts: IDict,
    response: scala.Double
  ): js.Any = js.native
  def afterUpdate(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    id: java.lang.String,
    props: IDict,
    opts: IDict,
    response: IDict
  ): js.Any = js.native
  def afterUpdate(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    id: java.lang.String,
    props: IDict,
    opts: IDict,
    response: Response
  ): js.Any = js.native
  def afterUpdate(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    id: scala.Double,
    props: IDict,
    opts: IDict,
    response: IDict
  ): js.Any = js.native
  def afterUpdate(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    id: scala.Double,
    props: IDict,
    opts: IDict,
    response: Response
  ): js.Any = js.native
  def afterUpdateAll(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    props: IDict,
    query: IDict,
    opts: IDict,
    response: js.Array[IDict]
  ): js.Any = js.native
  def afterUpdateAll(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    props: IDict,
    query: IDict,
    opts: IDict,
    response: Response
  ): js.Any = js.native
  def afterUpdateMany(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    props: js.Array[IDict],
    opts: IDict,
    response: js.Array[IDict]
  ): js.Any = js.native
  def afterUpdateMany(
    mapper: jsDashDataLib.jsDashDataMod.Mapper,
    props: js.Array[IDict],
    opts: IDict,
    response: Response
  ): js.Any = js.native
  def beforeCount(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict): js.Any = js.native
  def beforeCreate(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict): js.Any = js.native
  def beforeCreateMany(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
  def beforeDestroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict): js.Any = js.native
  def beforeDestroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict): js.Any = js.native
  def beforeDestroyAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict): js.Any = js.native
  def beforeFind(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict): js.Any = js.native
  def beforeFind(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict): js.Any = js.native
  def beforeFindAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict): js.Any = js.native
  def beforeSum(mapper: jsDashDataLib.jsDashDataMod.Mapper, field: java.lang.String, query: IDict, opts: IDict): js.Any = js.native
  def beforeUpdate(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, props: IDict, opts: IDict): js.Any = js.native
  def beforeUpdate(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, props: IDict, opts: IDict): js.Any = js.native
  def beforeUpdateAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, query: IDict, opts: IDict): js.Any = js.native
  def beforeUpdateMany(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
  def count(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict): js.Any = js.native
  def create(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, opts: IDict): js.Any = js.native
  def createMany(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
  def dbg(args: js.Any*): scala.Unit = js.native
  def destroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict): js.Any = js.native
  def destroy(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict): js.Any = js.native
  def destroyAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict): js.Any = js.native
  def find(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, opts: IDict): js.Any = js.native
  def find(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, opts: IDict): js.Any = js.native
  def findAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, query: IDict, opts: IDict): js.Any = js.native
  def loadBelongsTo(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
  def loadBelongsTo(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
  def loadHasMany(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
  def loadHasMany(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
  def loadHasManyForeignKeys(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
  def loadHasManyForeignKeys(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
  def loadHasManyLocalKeys(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
  def loadHasManyLocalKeys(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
  def loadHasOne(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: js.Array[IDict], __opts: IDict): js.Promise[_] = js.native
  def loadHasOne(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, records: IDict, __opts: IDict): js.Promise[_] = js.native
  def log(level: java.lang.String, args: js.Any*): scala.Unit = js.native
  def makeBelongsToForeignKey(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, record: IDict): java.lang.String = js.native
  def makeHasManyForeignKey(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, record: IDict): java.lang.String = js.native
  def makeHasManyForeignKeys(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, record: IDict): java.lang.String = js.native
  def makeHasManyLocalKeys(mapper: jsDashDataLib.jsDashDataMod.Mapper, `def`: IDict, record: IDict): java.lang.String = js.native
  def respond(response: Response, opts: IDict): IDict | Response = js.native
  def sum(mapper: jsDashDataLib.jsDashDataMod.Mapper, field: java.lang.String, query: IDict, opts: IDict): js.Any = js.native
  def update(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: java.lang.String, props: IDict, opts: IDict): js.Any = js.native
  def update(mapper: jsDashDataLib.jsDashDataMod.Mapper, id: scala.Double, props: IDict, opts: IDict): js.Any = js.native
  def updateAll(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: IDict, query: IDict, opts: IDict): js.Any = js.native
  def updateMany(mapper: jsDashDataLib.jsDashDataMod.Mapper, props: js.Array[IDict], opts: IDict): js.Any = js.native
}

@JSImport("js-data-adapter", "Adapter")
@js.native
object Adapter extends js.Object {
  def extend(): jsDashDataDashAdapterLib.Anon_ClassProps = js.native
  def extend(instanceProps: jsDashDataDashAdapterLib.jsDashDataDashAdapterMod.IDict): jsDashDataDashAdapterLib.Anon_ClassProps = js.native
  def extend(
    instanceProps: jsDashDataDashAdapterLib.jsDashDataDashAdapterMod.IDict,
    classProps: jsDashDataDashAdapterLib.jsDashDataDashAdapterMod.IDict
  ): jsDashDataDashAdapterLib.Anon_ClassProps = js.native
}

