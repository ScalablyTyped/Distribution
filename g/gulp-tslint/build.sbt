organization := "org.scalablytyped"
name := "gulp-tslint"
version := "8.1.4-9a25d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-65a65c",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-052e82",
  "org.scalablytyped" %%% "babel-code-frame" % "6.20-dt-20190212Z-856656",
  "org.scalablytyped" %%% "builtin-modules" % "2.0-dt-20180214Z-2120f2",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6d01d0",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-f1b784",
  "org.scalablytyped" %%% "commander" % "2.19.0-c4be45",
  "org.scalablytyped" %%% "diff" % "4.0-dt-20190129Z-6c91bf",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-1f537b",
  "org.scalablytyped" %%% "fancy-log" % "1.3-dt-20190212Z-de4eb5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-55635b",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-0397ba",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-706696",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-ec3c08",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20180507Z-59f79d",
  "org.scalablytyped" %%% "semver" % "5.5-dt-20180214Z-cc5b51",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-155129",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-17cb10",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab",
  "org.scalablytyped" %%% "tslint" % "5.14.0-d8ec38",
  "org.scalablytyped" %%% "tsutils" % "2.29.0-6b9b18",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-09c87f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        