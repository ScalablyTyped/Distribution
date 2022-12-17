organization := "org.scalablytyped"
name := "koa-pino-logger"
version := "3.0-dt-20211202Z-cdd8c4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pino" % "8.7.0-3f0d6e",
  "org.scalablytyped" %%% "pino-http" % "5.8-dt-20211202Z-52fd8d",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-02af79",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-23665c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
