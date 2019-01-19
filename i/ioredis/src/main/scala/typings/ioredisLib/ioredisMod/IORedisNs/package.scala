package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IORedisNs {
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
}
