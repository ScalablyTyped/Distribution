package typings.lokijs

import org.scalablytyped.runtime.TopLevel
import typings.lokijs.anon.And
import typings.lokijs.anon.YinkeyofLokiOpsany
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
type LokiConstructor = Loki

type LokiQuery[E] = PartialModel[E & And, YinkeyofLokiOpsany]

type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof E ]:? T | E[P]}
  */ typings.lokijs.lokijsStrings.PartialModel & TopLevel[E]

// type aliases to allow the nested classes inside LokiConstructor to extend classes sharing them same name(s) as themselves
type _Collection[E /* <: js.Object */] = Collection[E]

type _DynamicView[E /* <: js.Object */] = DynamicView[E]

type _KeyValueStore = KeyValueStore

type _LokiFsAdapter = LokiFsAdapter

type _LokiLocalStorageAdapter = LokiLocalStorageAdapter

type _LokiMemoryAdapter = LokiMemoryAdapter

type _LokiPartitioningAdapter = LokiPartitioningAdapter
