package typings
package grpcLib.grpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait status extends js.Object

@JSImport("grpc", "status")
@js.native
object status extends js.Object {
  /**
       * The operation was aborted, typically due to a concurrency issue
       * like sequencer check failures, transaction aborts, etc.
       *
       * See litmus test above for deciding between FAILED_PRECONDITION,
       * ABORTED, and UNAVAILABLE.
       */
  @js.native
  sealed trait ABORTED
    extends grpcLib.grpcMod.status
  
  /**
       * Some entity that we attempted to create (e.g., file or directory)
       * already exists.
       */
  @js.native
  sealed trait ALREADY_EXISTS
    extends grpcLib.grpcMod.status
  
  /**
       * The operation was cancelled (typically by the caller).
       */
  @js.native
  sealed trait CANCELLED
    extends grpcLib.grpcMod.status
  
  /**
       * Unrecoverable data loss or corruption.
       */
  @js.native
  sealed trait DATA_LOSS
    extends grpcLib.grpcMod.status
  
  /**
       * Deadline expired before operation could complete.  For operations
       * that change the state of the system, this error may be returned
       * even if the operation has completed successfully.  For example, a
       * successful response from a server could have been delayed long
       * enough for the deadline to expire.
       */
  @js.native
  sealed trait DEADLINE_EXCEEDED
    extends grpcLib.grpcMod.status
  
  /**
       * Operation was rejected because the system is not in a state
       * required for the operation's execution.  For example, directory
       * to be deleted may be non-empty, an rmdir operation is applied to
       * a non-directory, etc.
       *
       * A litmus test that may help a service implementor in deciding
       * between FAILED_PRECONDITION, ABORTED, and UNAVAILABLE:
       *
       *  - Use UNAVAILABLE if the client can retry just the failing call.
       *  - Use ABORTED if the client should retry at a higher-level
       *    (e.g., restarting a read-modify-write sequence).
       *  - Use FAILED_PRECONDITION if the client should not retry until
       *    the system state has been explicitly fixed.  E.g., if an "rmdir"
       *    fails because the directory is non-empty, FAILED_PRECONDITION
       *    should be returned since the client should not retry unless
       *    they have first fixed up the directory by deleting files from it.
       *  - Use FAILED_PRECONDITION if the client performs conditional
       *    REST Get/Update/Delete on a resource and the resource on the
       *    server does not match the condition. E.g., conflicting
       *    read-modify-write on the same resource.
       */
  @js.native
  sealed trait FAILED_PRECONDITION
    extends grpcLib.grpcMod.status
  
  /**
       * Internal errors.  Means some invariants expected by underlying
       * system has been broken.  If you see one of these errors,
       * something is very broken.
       */
  @js.native
  sealed trait INTERNAL
    extends grpcLib.grpcMod.status
  
  /**
       * Client specified an invalid argument.  Note that this differs
       * from FAILED_PRECONDITION.  INVALID_ARGUMENT indicates arguments
       * that are problematic regardless of the state of the system
       * (e.g., a malformed file name).
       */
  @js.native
  sealed trait INVALID_ARGUMENT
    extends grpcLib.grpcMod.status
  
  /**
       * Some requested entity (e.g., file or directory) was not found.
       */
  @js.native
  sealed trait NOT_FOUND
    extends grpcLib.grpcMod.status
  
  /**
       * Not an error; returned on success
       */
  @js.native
  sealed trait OK
    extends grpcLib.grpcMod.status
  
  /**
       * Operation was attempted past the valid range.  E.g., seeking or
       * reading past end of file.
       *
       * Unlike INVALID_ARGUMENT, this error indicates a problem that may
       * be fixed if the system state changes. For example, a 32-bit file
       * system will generate INVALID_ARGUMENT if asked to read at an
       * offset that is not in the range [0,2^32-1], but it will generate
       * OUT_OF_RANGE if asked to read from an offset past the current
       * file size.
       *
       * There is a fair bit of overlap between FAILED_PRECONDITION and
       * OUT_OF_RANGE.  We recommend using OUT_OF_RANGE (the more specific
       * error) when it applies so that callers who are iterating through
       * a space can easily look for an OUT_OF_RANGE error to detect when
       * they are done.
       */
  @js.native
  sealed trait OUT_OF_RANGE
    extends grpcLib.grpcMod.status
  
  /**
       * The caller does not have permission to execute the specified
       * operation.  PERMISSION_DENIED must not be used for rejections
       * caused by exhausting some resource (use RESOURCE_EXHAUSTED
       * instead for those errors).  PERMISSION_DENIED must not be
       * used if the caller can not be identified (use UNAUTHENTICATED
       * instead for those errors).
       */
  @js.native
  sealed trait PERMISSION_DENIED
    extends grpcLib.grpcMod.status
  
  /**
       * Some resource has been exhausted, perhaps a per-user quota, or
       * perhaps the entire file system is out of space.
       */
  @js.native
  sealed trait RESOURCE_EXHAUSTED
    extends grpcLib.grpcMod.status
  
  /**
       * The request does not have valid authentication credentials for the
       * operation.
       */
  @js.native
  sealed trait UNAUTHENTICATED
    extends grpcLib.grpcMod.status
  
  /**
       * The service is currently unavailable.  This is a most likely a
       * transient condition and may be corrected by retrying with
       * a backoff.
       *
       * See litmus test above for deciding between FAILED_PRECONDITION,
       * ABORTED, and UNAVAILABLE.
       */
  @js.native
  sealed trait UNAVAILABLE
    extends grpcLib.grpcMod.status
  
  /**
       * Operation is not implemented or not supported/enabled in this service.
       */
  @js.native
  sealed trait UNIMPLEMENTED
    extends grpcLib.grpcMod.status
  
  /**
       * Unknown error.  An example of where this error may be returned is
       * if a status value received from another address space belongs to
       * an error-space that is not known in this address space.  Also
       * errors raised by APIs that do not return enough error information
       * may be converted to this error.
       */
  @js.native
  sealed trait UNKNOWN
    extends grpcLib.grpcMod.status
  
  /* 10 */ val ABORTED: ABORTED with scala.Double = js.native
  /* 6 */ val ALREADY_EXISTS: ALREADY_EXISTS with scala.Double = js.native
  /* 1 */ val CANCELLED: CANCELLED with scala.Double = js.native
  /* 15 */ val DATA_LOSS: DATA_LOSS with scala.Double = js.native
  /* 4 */ val DEADLINE_EXCEEDED: DEADLINE_EXCEEDED with scala.Double = js.native
  /* 9 */ val FAILED_PRECONDITION: FAILED_PRECONDITION with scala.Double = js.native
  /* 13 */ val INTERNAL: INTERNAL with scala.Double = js.native
  /* 3 */ val INVALID_ARGUMENT: INVALID_ARGUMENT with scala.Double = js.native
  /* 5 */ val NOT_FOUND: NOT_FOUND with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 11 */ val OUT_OF_RANGE: OUT_OF_RANGE with scala.Double = js.native
  /* 7 */ val PERMISSION_DENIED: PERMISSION_DENIED with scala.Double = js.native
  /* 8 */ val RESOURCE_EXHAUSTED: RESOURCE_EXHAUSTED with scala.Double = js.native
  /* 16 */ val UNAUTHENTICATED: UNAUTHENTICATED with scala.Double = js.native
  /* 14 */ val UNAVAILABLE: UNAVAILABLE with scala.Double = js.native
  /* 12 */ val UNIMPLEMENTED: UNIMPLEMENTED with scala.Double = js.native
  /* 2 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[grpcLib.grpcMod.status with scala.Double] = js.native
}

