organization := "org.scalablytyped"
name := "ionic__cli-framework"
version := "1.7.0-793afc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-escapes" % "3.0-dt-20190306Z-bf2afd",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-d84c1e",
  "org.scalablytyped" %%% "chalk" % "2.4.2-ca1e30",
  "org.scalablytyped" %%% "cli-cursor" % "2.1-dt-20181224Z-ef12f1",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-5a34a6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-4593ac",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-faeaa3",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-a8786c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "inquirer" % "6.x-dt-20190322Z-f1ad93",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-d2e142",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-a89099",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-a4bb6f",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-dbf088",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-8e2f8a",
  "org.scalablytyped" %%% "ionic__utils-subprocess" % "0.1.0-8dc5d9",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-afccfe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "log-update" % "3.2.0-ee019f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "rimraf" % "2.0-dt-20180214Z-a798a1",
  "org.scalablytyped" %%% "rxjs" % "6.4.0-f8b93e",
  "org.scalablytyped" %%% "slice-ansi" % "2.0-dt-20181119Z-04a587",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "string-width" % "2.0-dt-20180530Z-33d626",
  "org.scalablytyped" %%% "strip-ansi" % "3.0-dt-20180214Z-dabcf8",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-1b70da",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20190322Z-77ab79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-d326d3",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-26977f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32",
  "org.scalablytyped" %%% "untildify" % "3.0-dt-20180214Z-4bc477",
  "org.scalablytyped" %%% "wrap-ansi" % "v3.0.0-dt-20190322Z-e3af9b",
  "org.scalablytyped" %%% "write-file-atomic" % "2.1-dt-20180214Z-ad46f3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        