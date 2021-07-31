package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * LokiJS
  * A lightweight document oriented javascript database
  * @author Joe Minichino <joe.minichino@gmail.com>
  */
type LokiConstructor = typings.lokijs.Loki

type LokiQuery[E] = typings.lokijs.PartialModel[E & typings.lokijs.anon.And, typings.lokijs.anon.YinkeyofLokiOpsany]

type PartialModel[E, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof E ]:? T | E[P]}
  */ typings.lokijs.lokijsStrings.PartialModel & org.scalablytyped.runtime.TopLevel[E]

// type aliases to allow the nested classes inside LokiConstructor to extend classes sharing them same name(s) as themselves
type _Collection[E /* <: js.Object */] = typings.lokijs.Collection[E]

type _KeyValueStore = typings.lokijs.KeyValueStore

type _LokiFsAdapter = typings.lokijs.LokiFsAdapter

type _LokiLocalStorageAdapter = typings.lokijs.LokiLocalStorageAdapter

type _LokiMemoryAdapter = typings.lokijs.LokiMemoryAdapter

type _LokiPartitioningAdapter = typings.lokijs.LokiPartitioningAdapter
