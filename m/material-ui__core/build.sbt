organization := "org.scalablytyped"
name := "material-ui__core"
version := "3.9.3-078ffb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "cheerio" % "v0.22.0-dt-20191203Z-416fd2",
  "org.scalablytyped" %%% "csstype" % "2.6.6-fd5644",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20191207Z-6efc70",
  "org.scalablytyped" %%% "jss" % "10.0.3-ca3ac9",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.0-8923e4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-b24434",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191220Z-22d23f",
  "org.scalablytyped" %%% "react-transition-group" % "4.2-dt-20191126Z-c0c4b6",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        