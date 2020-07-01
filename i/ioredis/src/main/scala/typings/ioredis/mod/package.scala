package typings.ioredis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* res */ T, scala.Unit]
  type CallbackFunction[T] = js.Function2[
    /* err */ js.UndefOr[typings.node.NodeJS.ErrnoException | scala.Null], 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  type ClusterNode = java.lang.String | scala.Double | typings.ioredis.mod.NodeConfiguration
  type Command = typings.ioredis.mod._Command
  type DNSLookupFunction = js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function3[
      /* err */ typings.node.NodeJS.ErrnoException | scala.Null, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type KeyType = java.lang.String | typings.node.Buffer
  type NatMap = org.scalablytyped.runtime.StringDictionary[typings.ioredis.anon.Host]
  type Ok = typings.ioredis.ioredisStrings.OK
  type PreferredSlaves = (js.Function1[
    /* slaves */ js.Array[typings.ioredis.mod.AddressFromResponse], 
    typings.ioredis.mod.AddressFromResponse | scala.Null
  ]) | js.Array[typings.ioredis.anon.Ip] | typings.ioredis.anon.Ip
  type ValueType = java.lang.String | typings.node.Buffer | scala.Double | js.Array[js.Any]
}
