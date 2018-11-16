package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LoadObjectOptions extends js.Object {
  /**
       * Deserialize bytes values as base64 strings instead of Buffers.
       * Defaults to `false`.
       */
  var binaryAsBase64: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * use the beta method argument order for client methods, with optional
       * arguments after the callback. This option is only a temporary stopgap
       * measure to smooth an API breakage. It is deprecated, and new code
       * should not use it.
       * Defaults to `false`
       */
  var deprecatedArgumentOrder: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Deserialize enum values as strings instead of numbers. Only works with
       * Protobuf.js 6 values.
       * Defaults to `true`.
       */
  var enumsAsStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Deserialize long values as strings instead of objects.
       * Defaults to `true`.
       */
  var longsAsStrings: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * 5 and 6 respectively indicate that an object from the corresponding
       * version of Protobuf.js is provided in the value argument. If the option
       * is 'detect', gRPC wll guess what the version is based on the structure
       * of the value.
       */
  var protobufjsVersion: js.UndefOr[
    grpcLib.grpcLibNumbers.`5` | grpcLib.grpcLibNumbers.`6` | grpcLib.grpcLibStrings.detect
  ] = js.undefined
}

