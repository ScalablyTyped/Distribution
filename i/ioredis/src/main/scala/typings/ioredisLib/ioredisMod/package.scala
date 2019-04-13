package typings
package ioredisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioredisMod {
  type CallbackFunction[T] = js.Function2[
    /* err */ js.UndefOr[nodeLib.NodeJSNs.ErrnoException | scala.Null], 
    /* result */ js.UndefOr[T], 
    scala.Unit
  ]
  type ClusterNode = java.lang.String | scala.Double | NodeConfiguration
  type DNSLookupFunction = js.Function2[
    /* hostname */ java.lang.String, 
    /* callback */ js.Function3[
      /* err */ nodeLib.NodeJSNs.ErrnoException, 
      /* address */ java.lang.String, 
      /* family */ scala.Double, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type KeyType = java.lang.String | nodeLib.Buffer
  type NatMap = org.scalablytyped.runtime.StringDictionary[ioredisLib.Anon_Host]
}
