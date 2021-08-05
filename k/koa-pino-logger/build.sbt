organization := "org.scalablytyped"
name := "koa-pino-logger"
version := "3.0-dt-20201015Z-ea5ffc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "pino" % "6.3-dt-20201119Z-79fbf8",
  "org.scalablytyped" %%% "pino-http" % "5.0-dt-20200826Z-65fc9f",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20200515Z-2e3ba5",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-c3ecdd",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
