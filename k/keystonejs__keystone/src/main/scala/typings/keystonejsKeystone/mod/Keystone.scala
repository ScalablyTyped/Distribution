package typings.keystonejsKeystone.mod

import org.scalablytyped.runtime.TopLevel
import typings.keystonejsKeystone.AnonApps
import typings.keystonejsKeystone.AnonConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@keystonejs/keystone", "Keystone")
@js.native
class Keystone[ListNames /* <: String */] protected () extends js.Object {
  def this(options: KeystoneOptions) = this()
  def connect(): js.Promise[Unit] = js.native
  def createAuthStrategy(options: AnonConfig[ListNames]): js.Any = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def createItems[ItemType](
    items: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in ListNames ]: std.Array<ItemType>}
    */ typings.keystonejsKeystone.keystonejsKeystoneStrings.Keystone with TopLevel[js.Any]
  ): js.Promise[Unit] = js.native
   // TODO
  def createList(name: String, schema: ListSchema[String]): Unit = js.native
  def disconnect(): js.Promise[Unit] = js.native
  // The return type is actually important info here. I don't believe this generic is unnecessary.
  // tslint:disable-next-line:no-unnecessary-generics
  def executeQuery[Output](query: String): Output = js.native
  def executeQuery[Output](query: String, config: QueryExecutionSchema): Output = js.native
  def extendGraphQLSchema(schema: GraphQLExtensionSchema): Unit = js.native
  def prepare(options: AnonApps): js.Promise[KeystonePrepareResult] = js.native
}

