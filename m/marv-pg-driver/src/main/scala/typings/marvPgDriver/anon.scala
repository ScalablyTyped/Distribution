package typings.marvPgDriver

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.marvPgDriver.marvPgDriverStrings.binary
import typings.marvPgDriver.marvPgDriverStrings.text
import typings.node.bufferMod.global.Buffer
import typings.pg.anon.TypeofPg
import typings.pg.mod.Client
import typings.pg.mod.ClientBase
import typings.pg.mod.ClientConfig
import typings.pg.mod.DatabaseError
import typings.pg.mod.Defaults_
import typings.pg.mod.Events
import typings.pg.mod.Pool
import typings.pg.mod.Query
import typings.pg.mod.QueryResultRow
import typings.pgProtocol.distMessagesMod.MessageName
import typings.pgTypes.mod.TypeId
import typings.pgTypes.mod.TypeParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Connection extends StObject {
    
    var connection: ClientConfig
    
    var logger: js.UndefOr[Warn] = js.undefined
    
    var pg: js.UndefOr[Typeofpg] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var table: js.UndefOr[String] = js.undefined
  }
  object Connection {
    
    inline def apply(connection: ClientConfig): Connection = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      inline def setConnection(value: ClientConfig): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Warn): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setPg(value: Typeofpg): Self = StObject.set(x, "pg", value.asInstanceOf[js.Any])
      
      inline def setPgUndefined: Self = StObject.set(x, "pg", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    }
  }
  
  trait Typeofpg extends StObject {
    
    var Client: Instantiable0[typings.pg.mod.Client]
    
    var ClientBase: Instantiable0[typings.pg.mod.ClientBase]
    
    var Connection: Instantiable0[typings.pg.mod.Connection]
    
    var DatabaseError: Instantiable3[
        /* message */ String, 
        /* length */ Double, 
        /* name */ MessageName, 
        typings.pg.mod.DatabaseError
      ]
    
    var Events: Instantiable0[typings.pg.mod.Events]
    
    var Pool: Instantiable0[typings.pg.mod.Pool]
    
    var Query: Instantiable0[typings.pg.mod.Query[QueryResultRow, js.Array[Any]]]
    
    val defaults: Defaults_ & ClientConfig
    
    val native: TypeofPg | Null
    
    val types: Typeoftypes
  }
  object Typeofpg {
    
    inline def apply(
      Client: Instantiable0[Client],
      ClientBase: Instantiable0[ClientBase],
      Connection: Instantiable0[typings.pg.mod.Connection],
      DatabaseError: Instantiable3[/* message */ String, /* length */ Double, /* name */ MessageName, DatabaseError],
      Events: Instantiable0[Events],
      Pool: Instantiable0[Pool],
      Query: Instantiable0[Query[QueryResultRow, js.Array[Any]]],
      defaults: Defaults_ & ClientConfig,
      types: Typeoftypes
    ): Typeofpg = {
      val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], ClientBase = ClientBase.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], DatabaseError = DatabaseError.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], Pool = Pool.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], native = null)
      __obj.asInstanceOf[Typeofpg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Typeofpg] (val x: Self) extends AnyVal {
      
      inline def setClient(value: Instantiable0[Client]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      inline def setClientBase(value: Instantiable0[ClientBase]): Self = StObject.set(x, "ClientBase", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Instantiable0[typings.pg.mod.Connection]): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
      
      inline def setDatabaseError(
        value: Instantiable3[/* message */ String, /* length */ Double, /* name */ MessageName, DatabaseError]
      ): Self = StObject.set(x, "DatabaseError", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: Defaults_ & ClientConfig): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: Instantiable0[Events]): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
      
      inline def setNative(value: TypeofPg): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeNull: Self = StObject.set(x, "native", null)
      
      inline def setPool(value: Instantiable0[Pool]): Self = StObject.set(x, "Pool", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Instantiable0[Query[QueryResultRow, js.Array[Any]]]): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Typeoftypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeoftypes extends StObject {
    
    def getTypeParser[T](oid: Double): TypeParser[String, T | String] = js.native
    def getTypeParser[T](oid: TypeId): TypeParser[String, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_binary[T](oid: Double, format: binary): TypeParser[Buffer, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_binary[T](oid: TypeId, format: binary): TypeParser[Buffer, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_text[T](oid: Double, format: text): TypeParser[String, T | String] = js.native
    @JSName("getTypeParser")
    def getTypeParser_text[T](oid: TypeId, format: text): TypeParser[String, T | String] = js.native
    
    def setTypeParser[T](oid: Double, parseFn: TypeParser[String, T]): Unit = js.native
    def setTypeParser[T](oid: TypeId, parseFn: TypeParser[String, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_binary[T](oid: Double, format: binary, parseFn: TypeParser[Buffer, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_binary[T](oid: TypeId, format: binary, parseFn: TypeParser[Buffer, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_text[T](oid: Double, format: text, parseFn: TypeParser[String, T]): Unit = js.native
    @JSName("setTypeParser")
    def setTypeParser_text[T](oid: TypeId, format: text, parseFn: TypeParser[String, T]): Unit = js.native
  }
  
  trait Warn extends StObject {
    
    def warn(args: Any*): Unit
  }
  object Warn {
    
    inline def apply(warn: /* repeated */ Any => Unit): Warn = {
      val __obj = js.Dynamic.literal(warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Warn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Warn] (val x: Self) extends AnyVal {
      
      inline def setWarn(value: /* repeated */ Any => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
